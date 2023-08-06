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
				Practical 7
			</h1>
		</div>
		<form method="post" action="">
        	<label for="Shape">Shape:</label>
			<select name="Shape">
				<option value="circle">Circle</option>
				<option value="rectangle">Rectangle</option>
			</select>
			<br>
        	<label for="Val1">Value 1:</label>
        	<input type="text" name="val1" id="val1" required>
			<br>
        	<label for="Val2">Value 2:</label>
        	<input type="text" name="val2" id="val2" required>
			<br>
        	<button type="submit">Submit</button>
    	</form>
		<?php 
			interface Shape {
				public function shapeArea();
			}

			class Circle implements Shape {
				private $radius;

				public function __construct($radius) {
					$this->radius = $radius;
				}

				public function shapeArea() {
					return pi() * $this->radius * $this->radius;
				}
			}

			class Rectangle implements Shape {
				private $length;
				private $breadth;

				public function __construct($length, $breadth) {
					$this->length = $length;
					$this->breadth = $breadth;
				}

				public function shapeArea() {
					return $this->length * $this->breadth;
				}
			}

			if ($_SERVER["REQUEST_METHOD"] == "POST") {
				$userShape = $_POST["Shape"];

				switch ($userShape) {
					case "circle":
						$rad1 = $_POST["val1"];
						$rad2 = $_POST["val2"];
						$circle1 = new Circle($rad1);
						$circle2 = new Circle($rad2);

						echo "Area of Circle with Radius {$rad1} is: {$circle1->shapeArea()}.";
						echo "<br>";
						echo "Area of Circle with Radius {$rad2} is: {$circle2->shapeArea()}.";
						break;
					case "rectangle":
						$length = $_POST["val1"];
						$breadth = $_POST["val2"];

						$rectangle = new Rectangle($length, $breadth);

						echo "Area of Rectangle with length:{$length} and breadth:{$breadth} is: {$rectangle->shapeArea()}.";
						break;
				}
			}
		?>
	</center>
</body>