import React, { useState } from 'react'
import { connect } from 'react-redux';
import { fetchRandom } from '../actions';

const From = (props) => {// component stateless
  const [state, setState] = useState();
  const onSubmit = (e) => {
    e.preventDefault();
    props.dispatch(fetchRandom(state));
  };
  return <div>
    <form onSubmit={onSubmit}>
      <label htmlFor="list"> Saca una ficha </label>
      <br />
      <br />
      <button type="submit" className="btn btn-secondary" disabled={props.loading}>
        Sacar
      </button>
    </form>
  </div>
}


const stateMapToPros = state => {
  return {
    loading: state.view.loading
  }
}


export default connect(stateMapToPros)(From)
