const initialState = {
  action: null,
  isLoading: false,
  isError: false,
  data: []
};

export const ReducerData = (state = initialState, action) => {
  switch (action.type) {
    case "getAllData":
      console.log("getAllData(action)");
      return {
        ...state,
        action: action.type,
        isLoading: true,
        isError: false
      };
    case "getAllDataFailed":
      console.log("getAllDataFailed(action)");
      return {
        ...state,
        action: action.type,
        isLoading: false,
        isError: true
      };
    case "getAllDataSuccess":
      console.log("getAllDataSuccess(action)");
      return {
        ...state,
        action: action.type,
        isLoading: false,
        isError: false,
        data: action.payload
      };

    case "addData":
      console.log("addData(action)");
      return {
        ...state,
        action: action.type,
        isLoading: true,
        isError: false
      };
    case "addDataFailed":
      console.log("addDataFailed(action)");
      return {
        ...state,
        action: action.type,
        isLoading: false,
        isError: true
      };
    case "addDataSuccess":
      console.log("addDataSuccess(action)");
      return {
        ...state,
        action: action.type,
        isLoading: false,
        isError: false
      };

    default:
      return state;
  }
};
