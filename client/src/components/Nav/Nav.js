import {Link} from 'react-router-dom';
import React from 'react';
import './Nav.css';


function Nav() {
    return (
        <div>
           <div className='navbar'>
            <Link classname="navbarMenu" to='/'>Main</Link>
            <Link classname="navbarMenu" to='/notice'>Notice</Link>
            <Link classname="navbarMenu" to='/mypage'>MyPage</Link>
            <Link classname="navbarMenu" to='/reserve'>ReservePage</Link>
            <Link classname="navbarMenu" to='/route'>RoutePage</Link>
           </div>
        </div>
    );
};

export default Nav;