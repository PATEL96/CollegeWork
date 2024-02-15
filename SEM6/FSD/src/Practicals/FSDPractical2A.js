import React from 'react'
import { Name } from './elements'

export default function FSDPractical2A() {
  return (
	<div>
		<button onClick={() => alert(`Hello ${Name}`)}>
			Click Me
		</button>
	</div>
  )
}
