import React from "react";
import { makeStyles } from "@material-ui/core/styles";
import Table from "@material-ui/core/Table";
import TableBody from "@material-ui/core/TableBody";
import TableCell from "@material-ui/core/TableCell";

import TableHead from "@material-ui/core/TableHead";
import TableRow from "@material-ui/core/TableRow";

const useStyles = makeStyles({
  table: {
    minWidth: 650
  }
});

export default function SimpleTable(props) {
  const classes = useStyles();

  console.log(props.data[0]);
  return (
    <Table className={classes.table} aria-label="simple table">
      <TableHead>
        <TableRow>
          <TableCell align="right">id_propinsi</TableCell>
          <TableCell align="right">id_kontrasepsi</TableCell>
          <TableCell align="right">jumplah_pemakai)</TableCell>
        </TableRow>
      </TableHead>
      <TableBody>
        {props.data.map(row => (
          <TableRow>
            <TableCell align="right">{row.id_propinsi}</TableCell>
            <TableCell align="right">{row.id_kontrasepsi}</TableCell>
            <TableCell align="right">{row.jumlah_pemakai}</TableCell>
          </TableRow>
        ))}
      </TableBody>
    </Table>
  );
}
