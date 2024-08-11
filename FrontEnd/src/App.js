import logo from './logo.svg';
import './App.css';
import { Link, Route, Routes } from 'react-router-dom';
import LogInComp from './components/LogInComp';
import HomeFunc from './components/HomeFunc';
import BuyerReg from './components/BuyerReg';
import ContactUs from './components/ContactUs';
import OwnerReg from './components/OwnerReg';
import AdminHome from './components/AdminHome';
import BuyerHome from './components/BuyerHome';
import AddProperty1 from './components/AddProperty1';
import OwnerHome from './components/OwnerHome';
import { useSelector } from 'react-redux';
import LogoutComp from './components/LogoutComp';
import ShowMyProperty from './components/ShowMyProperty';
import ShowAllBuyer from './components/ShowAllBuyer';
import ShowAllOwners from './components/ShowAllOwners';
import ShowAllProperties from './components/ShowAllProperties';
import OwnerInfo from './components/OwnerInfo';
import FooterComponent from './components/Footer';
import Payment from './components/Payment';
import ShowAllTransaction from './components/ShowAllTransaction';
import PropertyRequestedBuyer from './components/PropertyRequestedBuyer';

function App() {

    const mystate = useSelector((state)=>state.logged)
  return (
    <div className="App">
       <div style={{display:mystate.loggedIn?"none":"block"}}>
           <ul class="nav navbar">
                <li class="nav-item">
                    <Link to="/" class="nav-link">Home</Link>
                </li>
                <li class="nav-item">
                    <Link to="/login" class="nav-link">Log In</Link>
                </li>
                <li class="nav-item">
                    <Link to="/buyerreg" class="nav-link">Buyer Registration</Link>
                </li>
                <li class="nav-item">
                    <Link to="/ownerreg" class="nav-link">Owner Registration</Link>
                </li>
               
            </ul>
           
       </div>



        <Routes>
            <Route path='/' element={<HomeFunc/>}/>
            <Route path='/login' element={<LogInComp/>}/>
            <Route path='/buyerreg' element={<BuyerReg/>}/>
            <Route path='/ownerreg' element={<OwnerReg/>}/>
            <Route path='/contactus' element={<ContactUs/>}/>

            <Route path='/adminhome' element={<AdminHome/>}/>
            <Route path='/getallbuyers' element={<ShowAllBuyer/>}/>
            <Route path='/getallowners' element={<ShowAllOwners/>}/>
            <Route path='/getallproperties' element={<ShowAllProperties/>}/>
            <Route path='/getalltransactions' element={<ShowAllTransaction/>}/>



            <Route path='/buyerhome' element={<BuyerHome/>}/> 
            <Route path='/ownerinfo' element={<OwnerInfo/>} /> 


            <Route path='/ownerhome' element={<OwnerHome/>}/> 
            <Route path='/addproperty' element={<AddProperty1/>}/>
            <Route path='/showmyproperty' element={<ShowMyProperty/>}/>
            <Route path='/propreq' element={<PropertyRequestedBuyer/>}/>

            <Route path='/logout' element={<LogoutComp/>}/>
            <Route path='/payment' element={<Payment/>}/>
       </Routes>
       <FooterComponent/>
    </div>
  );
}


export default App;
