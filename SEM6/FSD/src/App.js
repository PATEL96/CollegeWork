import './App.css';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import FSDPractical2A from './Practicals/FSDPractical2A';
import FSDPractical2B from './Practicals/FSDPractical2B';
import PracticalList from './Practicals/PracticalList';
import { FSDPractical1 } from './Practicals/FSDPractical1';
import Home from './Practicals/Home';
import FSDPractical5A from './Practicals/FSDPractical5A';
import FSDPractical5B from './Practicals/FSDPreactical5B';

const App = () => {
  return(
    <div className='App'>
      <Router basename='/'>
        <PracticalList />
        <Routes>
          <Route exact path='/' element={<Home />} />
          <Route exact path='/Practical1' element={<FSDPractical1 />} />
          <Route exact path='/Practical2A' element={<FSDPractical2A />} />
          <Route exact path='/Practical2B' element={<FSDPractical2B />} />
          <Route exact path='/Practical5A' element={<FSDPractical5A />} />
          <Route exact path='/Practical5B' element={<FSDPractical5B />} />
        </Routes>
      </Router>
    </div>
  );
};

export default App;