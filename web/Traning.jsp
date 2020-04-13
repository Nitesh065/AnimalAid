<html>
        <head><style><%@include file="/WEB-INF/css/style.css"  %></style></head>
    <body>

         <div class="search-head">
            <a  href="index.jsp">Back to Home</a>
        </div>
        <hr>
        <h1>Training Programs at Animal Aid</h1>
        
        <p><h4>First Aid Training at Animal Aid in Udaipur, Raj</h4>
            Animal Aid offers one of India?s only first-aid training courses for injured and ill street animals. Animal Aid?s training mission is to empower dedicated animals lovers from across India to start their own rescue teams of all sizes in their own cities. Animal shelters in India are few and far between and an astounding number of cities in India have no animal shelters at all. Without treatment and care, unowned dogs, cats, donkeys, cows and other animals across India die from wounds and illnesses that could have easily been treated.</p>
        <br>
        <p><strong>Our first-aid training course is for residents of India</strong> who can?t bear to see street animals die from treatable conditions anymore and who want to initiate street animal protection in their city.</p>
        <br>
        <p><strong>Our First Aid Training program was developed for people who are willing to become a point of contact for street animal first aid in their community.</strong>This training is designed for applicants who plan on using what they have learned not just for animals who they might come across by chance, but for animals that people in their community have seen and have alerted them to.</p>
        <br>
        <p>Would you be willing to be such a person, known as a first aid treatment contact in your area? If so, this training is a "must" for you--you'll learn practical first aid "how-tos" and also, tips for fundraising, recruiting volunteers, presenting in schools and you'll make friends---for life! While it is essential to consult with a veterinarian for the treatment of any animal, the reality is that in most cities in India, veterinary help is not available.</p>
        <br>
        <h2>Our intensive 7-day first aid course will train you to:</h2>
        <ol>
            <li>Safely rescue and handle injured and ill animals</li>
            <li>Educate your community about dog-bite and rabies prevention in humans and animals</li>
            <li>Perform a basic physical examination to measure vital signs and identify problems</li>
            <li>Treat the most common killers of street animals such as wounds, mange, and common illnesses</li>
            <li>Calculate dose rates for giving medication</li>
            <li>Give physical therapy to dogs with spinal injuries from accidents</li>
        </ol>
        <p>Trainees will also have the unique opportunity to observe the treatment of a wide variety and large volume of cases at one of the largest and busiest hospitals for street animals in the country. <strong>The 7-day course is free of cost and is run on-site at Animal Aid in Udaipur, Rajasthan.</strong>Trainees will be assessed throughout the course and advanced according to their level of understanding. Your instructors will be highly experienced members of Animal Aid?s medical team.</p>
        <p>Participants must be 18 years old and older. Trainees must be fully vaccinated against rabies before attending the training course. Training is given mainly in English and partly in Hindi and all of our training materials and protocols are in English. Therefore participants must be fluent in English and Hindi.</p>
        <h2>Important notice</h2>
        <%
    java.sql.Connection con = mypakge.Connect.connect();
    String qr = "SELECT * from notice ORDER BY notice_id DESC LIMIT 1";
    java.sql.PreparedStatement ps = con.prepareStatement(qr);
    java.sql.ResultSet rs = ps.executeQuery();
    %>
 
             <table border="4" width="3" cellspacing="2" cellpadding="11">
        <thead>
            <tr>
                <th>Title</th>
                <th>Message</th>
                <th>Date</th>
            </tr>
        </thead>
        <tbody>
<%
        while(rs.next()){
            
        String s2 = rs.getString(2);
        String s3 = rs.getString(3);
        String s4 = rs.getString(3);
%>           
            <tr>
                <td><%out.println(s2);%></td>
                <td><%out.println(s2);%></td>
                <td><%out.println(s2);%></td>
                <%
        }
        con.close();
                %>
        </tbody>
    </table>   
    </body>
</html>

