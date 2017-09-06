<%--
  Created by IntelliJ IDEA.
  User: tadashii
  Date: 7/17/2017
  Time: 8:22 PM
  To change this template use File | Settings | File Templates.
--%>
<nav class="uk-navbar-container uk-padding-small" uk-navbar>
    <div class="uk-navbar-left">

        <ul class="uk-navbar-nav">
            <li class="uk-active"><a href="#">Active</a></li>
            <li>
                <a href="#">Parent</a>
            </li>
            <li><a href="#">Item</a></li>
        </ul>

    </div>
    <div class="uk-navbar-right">
        <ul class="uk-navbar-nav">
            <li><%
                Cookie cookie[] = request.getCookies();

                if (cookie[0].getValue() == null){
                    out.println("<a href='#'>Login</a>");
                }else {
                    out.println("<a href=''>" + cookie[2].getValue() + "</a>");

                    out.println("<div class='uk-navbar-dropdown'><ul class='uk-nav uk-navbar-dropdown-nav'>");
                    out.println("<li class='uk-active'><a href='ServletLogoutCookie'>Logout</a></li>");
                    out.println("</ul></div>");
                }
            %></li>
        </ul>
    </div>
</nav>
