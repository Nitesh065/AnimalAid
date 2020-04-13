<%
    String v1 = "", v2 = "";
    Cookie ck[] = request.getCookies();
    if (ck != null) {
        for (Cookie c : ck) {
            String s = c.getName();
            if (s.equals("username")) {
                v1 = c.getValue();
            } else if (s.equals("password")) {
                v2 = c.getValue();
            }
        }
    }


%>
<html>
    <head>   <style><%@include file="/WEB-INF/css/style.css"  %></style> </head>
    <body>
        <div class="search-head">
            <a  href="index.jsp">Back to Home</a>
        </div>
        <hr>
        <form action="Verify_user" class="lf">
            <div class="user">
                <pre>
          
                               <label for="username"><b>Username</b>></label>
                               <input type="text" name="username" value="<%=v1%>" placeholder="Enter Username" autofocus required>
                               <label for="password"><b>Password</b></label>
                               <input type="password" name="Password" value="<%=v2%>" placeholder="Enter Password" autofocus required>
                               <label for="utype"><b>User Type</b></label>
               
                               <select name="utype"><option>Buyer</option>
                                                    <option>Admin</option></select>
                
                               <input  class="button" type="submit" value="Login">
                               <label>Save Password</label>
                               <input type="checkbox" name="save">
                        </pre>
                        </div>
                        </form>
                        <a href="Registration.jsp" style="font-size:130%;text-decoration: none" >New User</a>
                        </body>
                        </html>
