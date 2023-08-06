<body>
	<a href="main.html" > Back </a>
	<br>
	<link href="style.css" rel="stylesheet">
	<center>
		<div>
			<h1 style="font-size:38px; " >
				Practical 2
			</h1>
		</div>
		<?php 
			$List = array("India"=>"Delhi", "USA"=>"Washington DC", "Japan"=>"Tokyo", "Korea"=>"Seoul", "China"=>"Beijing");

			echo "<br>";
			echo "Unsorted<br>";
			echo "<br>";

			echo '<table border="1" style="font-size:24px; font-weight: 800;" >';
			foreach ($List as $country=>$cap) {
				echo "<tr>";
				// echo "Country: ". $country . ", Capital: ". $cap;
				echo "<td>". $country . "</td>";
				echo "<td>". $cap . "</td>";
				echo "</tr>";
				// echo "<br>";
			}
			echo "</table>";

			ksort($List);
			echo "<br>";
			echo "Sorted<br>";
			echo "<br>";
	
			echo '<table border="1" style="font-size:24px; font-weight: 800;" >';
			foreach ($List as $country=>$cap) {
				echo "<tr>";
				// echo "Country: ". $country . ", Capital: ". $cap;
				echo "<td>". $country . "</td>";
				echo "<td>". $cap . "</td>";
				echo "</tr>";
				// echo "<br>";
			}
			echo "</table>";
		?>
	</center>
</body>