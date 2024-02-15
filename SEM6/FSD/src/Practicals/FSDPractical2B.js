import React from 'react'

export default function FSDPractical2B() {

	const list = [
		{
			id: 1,
			name: "PATEL96"
		},
		{
			id: 2,
			name: "RAJ D PATEL"
		}
	]

	return (
		<div>
			{list.map(list => (
				<div>
					Hello {list.name} your Id id {list.id}
				</div>
			))}
		</div>
	)
}