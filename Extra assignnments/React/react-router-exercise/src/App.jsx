import { Cart } from "./pages/Cart";
import { Home } from "./pages/Home";
import { Product } from "./pages/Product";
import { Routes, Route } from "react-router-dom";
import { Link } from "react-router-dom";
import { Wishlist } from "./pages/Wishlist";
import { Category } from "./pages/Category";

function App() {
  return (
    <>
    <nav>
      <Link to="/">Home  </Link> 
      <Link to="/category"> Category  </Link>  
      <Link to="/cart"> Cart  </Link> 
      <Link to="/wishlist"> Wishlist  </Link>
    </nav>
      <div>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/category" element={<Category />} />
          <Route path="/cart" element={<Cart />} />
          <Route path="/wishlist" element={<Wishlist />} />
        </Routes>
      </div>
    </>
  );
}

export default App;
