import React from 'react'
import { connect } from 'react-redux';
const Result = (props) => {
  
  return <div>
     {props.result && 'FICHA '+ props.result} 
  </div>
}


const stateMapToPros = state => {
  return {
    result: state.random.result?.ficha
  }
}


export default connect(stateMapToPros)(Result)
