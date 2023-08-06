<body>
	<div>
		Name: Raj D. Patel <br>
		Enrollment: 202103103510081 <br>
		Class: I.T. A (Batch 1)
	</div>
	<a href="main.html" >Back</a>
	<br>
	<link href="style.css" rel="stylesheet">
	<center>
		<div>
			<h1 style="font-size:38px; " >
				Practical 3
			</h1>
		</div>
		<form method="post" action="">
        	<label for="inputString">Enter a string:</label>
        	<input type="text" name="inputString" id="inputString" required>
        	<input type="text" name="searchString" id="searchString" required>
        	<button type="submit">Search Position</button>
    	</form>
		<?php
			function findLastOccurrencePosition($haystack, $needle) {
    			$position = strrpos($haystack, $needle);
		    	return $position !== false ? $position : -1; // Return -1 if the substring is not found
			}

		// Example usage:
		if ($_SERVER["REQUEST_METHOD"] == "POST") {
			$existingString = $_POST["inputString"];
			$searchString = $_POST["searchString"];
			$position = findLastOccurrencePosition($existingString, $searchString);
			if ($position !== -1) {
				echo "Last occurrence of '{$searchString}' found at position: {$position} in: <br>";
				echo $existingString;
			} else {
				echo "Substring not found in the existing string.";
			}
		}
		?>
	</center>
</body>