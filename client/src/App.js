import './App.css';
import {BrowserRouter, Routes, Route} from 'react-router-dom';
import Nav from './components/Nav/Nav';
import MainPage from './components/MainPage/MainPage';
import NoticePage from './components/NoticePage/NoticePage';
import Mypage from './components/MyPage/MyPage';
import ReservePage from './components/ReservePage/ReservePage';
import RoutePage from './components/RoutePage/RoutePage';

function App() {
  return (
    <BrowserRouter>
        <div className="App">
          <Nav/>
          <Routes>
            <Route path="/" element={<MainPage/>}/>
            <Route path="/notice" element={<NoticePage/>}/>
            <Route path="/mypage" element={<Mypage/>}/>
            <Route path="/reserve" element={<ReservePage/>}/>
            <Route path="/route" element={<RoutePage/>}/>
          </Routes>
        </div>
    </BrowserRouter>
  );
}

export default App;
