<%--
  Created by IntelliJ IDEA.
  User: tadashi
  Date: 7/1/17
  Time: 3:18 PM
  To change this template use File | Settings | File Templates.
--%>
<nav class="uk-navbar-container uk-padding-small" uk-navbar>
    <div class="uk-navbar-left">

        <ul class="uk-navbar-nav">
            <li class="uk-active"><a href="/">Home</a></li>
            <li>
                <a href="#">Parent</a>
            </li>
            <li><a href="#">Item</a></li>
        </ul>

    </div>
    <div class="uk-navbar-right">
        <ul class="uk-navbar-nav">
            <li><%
                HttpSession httpSession = request.getSession();
                String username = (String) httpSession.getAttribute("username");
                if (username == null){
                    out.println("<a href='#'>Login</a>");
                }else {
                    out.println("<a href=''>" + username + "</a>");
                    out.println("<div class='uk-navbar-dropdown'><ul class='uk-nav uk-navbar-dropdown-nav'>");
                    out.println("<li class='uk-active'><a href='ServletLogout'>Logout</a></li>");
                    out.println("</ul></div>");
                }
            %></li>
        </ul>
    </div>
</nav>
