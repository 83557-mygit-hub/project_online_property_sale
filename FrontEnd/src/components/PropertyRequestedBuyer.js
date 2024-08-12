import React, { useState, useEffect } from 'react';
import { Link } from 'react-router-dom';

const PropertyRequestedBuyer = () => {
  const [buyers, setBuyers] = useState([]);
  const [obj, setObj] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/getallrequests")
      .then(res => res.json())
      .then(data => {
        setObj(data);

        // Assuming data structure: { fname, lname, email, contact_no, buyer_id, property_id, owner_id }
        const extractedBuyerData = data.filter(item => item.owner_id === JSON.parse(localStorage.getItem('loggedOwner')).id);
        setBuyers(extractedBuyerData);
      });
  }, []);

  return (
    <div>
      <div className='nav-item'>
                <ul className="nav navbar">
                    <li className="nav-item">
                    <Link to="/addproperty" className="nav-link">Add Property</Link>
                    </li>
                    <li className="nav-item">
                    <Link to="/showmyproperty" className="nav-link">Show My Property</Link>
                    </li>
                    <li className="nav-item">
                    <Link to="/propreq" className="nav-link">Property Request</Link>
                    </li>
                    <li className="nav-item">
                    <Link to="/ownerhome" className="nav-link">Owner Home</Link>
                    </li>
                    <li className="nav-item">
                    <Link to="/logout" className="nav-link">Log Out</Link></li>
                </ul>
                </div>
      <div>
        <h1 class="mb-4">Buyer Information</h1>
        <div class="mb-3">
          <h2>Buyer IDs</h2>
        </div>
        <table class="table table-striped table-bordered">
          <thead class="thead-dark">
            <tr>
              <th>First Name</th>
              <th>Last Name</th>
              <th>Email</th>
              <th>Contact No</th>
              <th>Buyer Id</th>
              <th>Property Id</th>
            </tr>
          </thead>
          <tbody>
            {buyers.map(buyer => (
              <tr key={buyer.buyer_id}>
                <td>{buyer.fname}</td>
                <td>{buyer.lname}</td>
                <td>{buyer.email}</td>
                <td>{buyer.contact_no}</td>
                <td>{buyer.buyer_id}</td>
                <td>{buyer.property_id}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
};

export default PropertyRequestedBuyer;
