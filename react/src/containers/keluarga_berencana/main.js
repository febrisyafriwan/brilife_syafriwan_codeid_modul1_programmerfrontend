import React from "react";
import { connect } from "react-redux";
import { getAllData, addData } from "./action";
import Table from "./component/Table";
class main extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      searchQuery: "",
      data: []
    };
  }

  componentDidMount() {
    this.props.getAllData();
  }

  render() {
    return (
      <div>
        <Table data={this.props.ReducerData.data} />
      </div>
    );
  }
}

function mapStateToProps(state) {
  console.log(state.ReducerData);
  return {
    ReducerData: state.ReducerData
  };
}
const mapDispatchToProps = dispatch => {
  return {
    getAllData: value => dispatch(getAllData(value)),
    addData: value => dispatch(addData(value))
  };
};

export default connect(
  mapStateToProps,
  mapDispatchToProps
)(main);
