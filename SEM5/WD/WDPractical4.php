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
				Practical 4
			</h1>
		</div>
		<form method="post" action="">
        	<label for="inputString">Enter a string:</label>
        	<input type="text" name="inputString" id="inputString" required>
        	<button type="submit">Remove Duplicates</button>
    	</form>
		<?php
			function removeDuplicates($inputString) {
				$uniqueCharacters = '';
				
				for ($i = 0; $i < strlen($inputString); $i++) {
					$currentChar = $inputString[$i];
					
					// Check if the character is not already in the $uniqueCharacters string
					if (strpos($uniqueCharacters, $currentChar) === false) {
						$uniqueCharacters .= $currentChar;
					}
				}
				
				return $uniqueCharacters;
			}
			
			// Example usage:
			if ($_SERVER["REQUEST_METHOD"] == "POST") {
				$userInput = $_POST["inputString"];
				$uniqueString = removeDuplicates($userInput);
				echo "<p>Original string: {$userInput}</p>";
				echo "<p>String with duplicates removed: {$uniqueString}</p>";
			}
		?>
	</center>
</body>