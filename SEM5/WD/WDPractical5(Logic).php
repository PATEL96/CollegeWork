<body>
	<div>
		Name: Raj D. Patel <br>
		Enrollment: 202103103510081 <br>
		Class: I.T. A (Batch 1)
	</div>
	<a href="WDPractical5(UI).php" >Back</a>
	<br>
	<link href="style.css" rel="stylesheet">
	<center>
		<?php
			class Calculator {
				public function add($num1, $num2) {
					return $num1 + $num2;
			    }

				public function sub($num1, $num2) {
			        return $num1 - $num2;
			    }
		
			    public function mult($num1, $num2) {
	        		return $num1 * $num2;
		    	}

			    public function div($num1, $num2) {
					if ($num2 != 0) {
						return $num1 / $num2;
			        } else {
						return "Cannot divide by zero";
			        }
			    }
			}

			if ($_SERVER["REQUEST_METHOD"] == "POST") {
				$num1 = $_POST["num1"];
			    $num2 = $_POST["num2"];
			    $operation = $_POST["operation"];

			    $calculator = new Calculator();
			
			    switch ($operation) {
					case "add":
				        $result = $calculator->add($num1, $num2);
			            break;
					case "sub":
						$result = $calculator->sub($num1, $num2);
			            break;
			        case "mult":
			            $result = $calculator->mult($num1, $num2);
			            break;
			        case "div":
		    	        $result = $calculator->div($num1, $num2);
			            break;
					default:
			            $result = "Invalid operation";
				}
				
				echo "Result: " . $result;
			}
		?>
	</center>
</body>