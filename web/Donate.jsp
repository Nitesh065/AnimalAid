<html>
    <head>   <style><%@include file="/WEB-INF/css/style.css"  %></style> </head>

    <body>
        <div class="search-head">
            <a  href="index.jsp">Back to Home</a>
        </div>
        <hr>
        <form action="Donate" class="lf">
            
            <pre>
            <lable for="name">Full_name</lable>
            <input type="text" name="name" placeholder="Enter your full name" required autofocus>
            <lable for="Addres">Address</lable>
            <input type="text" name="Address" placeholder="Enter your full address" required autofocus>
            <lable for="Mobile_no">Mobile_no</lable>

            <input type="number" name="Mobile_no" placeholder="Enter 10 digit number" required autofocus>
            <lable for="amount">Amount</lable>
            <input type="number" name="amount" placeholder="Enter Donation amount" required autofocus>
             <input class="button" type="submit" value="Submit">
            </pre>
            






        </form>



    </body>





</html>