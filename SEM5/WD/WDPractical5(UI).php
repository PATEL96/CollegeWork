<!DOCTYPE html>
<html>
<body>
    <div>
		Name: Raj D. Patel <br>
		Enrollment: 202103103510081 <br>
		Class: I.T. A (Batch 1)
	</div>
    <a href="main.html" >Back</a>
    <link href="style.css" rel="stylesheet">
	<br>
    <center>
        <div>
			<h1 style="font-size:38px; " >
				Practical 5
			</h1>
		</div>
        <link href="style.css" rel="stylesheet">
        <form method="post" action="WDPractical5(Logic).php">
            <label for="num1">Enter Value 1:</label>
            <input type="number" name="num1" id="num1" required>
            <br>
            <label for="num2">Enter Value 2:</label>
            <input type="number" name="num2" id="num2" required>
            <br>
            <label>Choose an operation:</label>
            <select name="operation">
                <option value="add">Add</option>
                <option value="sub">Subtract</option>
                <option value="mult">Multiply</option>
                <option value="div">Divide</option>
            </select>
            <br>
            <button type="submit">Calculate</button>
        </form>
    </center>
</body>
</html>
