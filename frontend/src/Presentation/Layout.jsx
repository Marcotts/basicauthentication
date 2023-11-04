import React from "react";
import NewsTable from "../Sections/News/NewsTable";
import "./Layout.css";

const Layout = () => {
    return (
        <div className="layout">
            <header>Header</header>
            <main>
                <NewsTable />
            </main>
            <aside>Aside</aside>
            <footer>Footer</footer>
        </div>
    );
};

export default Layout;