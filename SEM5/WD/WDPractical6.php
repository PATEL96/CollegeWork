<body>
	<a href="main.html" >Back</a>
	<br>
	<link href="style.css" rel="stylesheet">
	<center>
		<div>
			<h1 style="font-size:38px; " >
				Practical 6
			</h1>
		</div>
		<form method="post" action="">
        	<label for="Name">Name:</label>
        	<input type="text" name="Name" id="Name" required>
			<br>
        	<label for="Name">Position:</label>
        	<input type="text" name="Position" id="Position" required>
			<br>
        	<button type="submit">Submit Details</button>
    	</form>
		<?php
			class Employee {
				public $name;
				public $position;

				public function __construct($name, $position){
					$this->name = $name;
					$this->position = $position;
				}

				public function printDetails() {
					echo "Dear {$this->name}, you are {$this->position}.";
				}
			}

			if ($_SERVER["REQUEST_METHOD"] == "POST") {
				$userName = $_POST["Name"];
				$userPosition = $_POST["Position"];
				$employee = new Employee($userName, $userPosition);
				$employee->printDetails();
			}

		?>
	</center>
</body>