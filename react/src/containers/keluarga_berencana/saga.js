import { call, put, takeLatest, takeEvery } from "redux-saga/effects";
import {
  getAllDataSuccess,
  getAllDataFailed,
  addDataSuccess,
  addDataFailed
} from "./action";

function* fetchAllData() {
  const json = yield fetch("http://localhost:8080/api/getAll", {
    method: "POST",
    headers: { "Content-Type": "application/json" }
  }).then(response => response.json());
  return json;
}
function* addData(body) {
  const json = yield fetch("http://localhost:8080/api/upload", {
    method: "POST",
    body: JSON.stringify(body),
    headers: { "Content-Type": "application/json" }
  }).then(response => response.json());
  return json;
}

export function* workerGetAllData() {
  try {
    const response = yield call(fetchAllData);
    console.log(response);
    if (response) {
      console.log("success");
      yield put(getAllDataSuccess(response));
    } else {
      console.log("failed");
      yield put(getAllDataFailed(response.message));
    }
  } catch (error) {
    yield put(getAllDataFailed());
    console.log("error", error);
  }
}

export function* workerAddAccount(action) {
  try {
    const response = yield call(addData, action.payload);
    console.log(response);
    if (response) {
      console.log("success");
      yield put(addDataSuccess());
    } else {
      console.log("failed");
      yield put(addDataFailed());
    }
  } catch (error) {
    yield put(addDataFailed());
    console.log("error", error);
  }
}

export function* watcherKeluarga() {
  yield takeLatest("getAllData", workerGetAllData);
  yield takeEvery("addData", workerAddAccount);
}
