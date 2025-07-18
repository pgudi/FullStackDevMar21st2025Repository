import React, { useEffect, useState } from 'react'
const API_PRODUCT_URL = "https://fakestoreapi.com/products"
const ProductsComponent = () => {
    const [products, setProducts] = useState([])

    async function getAllProducts() {
        const response = await fetch(API_PRODUCT_URL)
        const allproducts = await response.json()
        console.log(allproducts);
        setProducts(allproducts)
    }

    useEffect(() => {
        getAllProducts()
    }, [products])
    return (
        <div>
            <div className="container-fluid">
                <div className="row justify-content-evenly">
                    {
                        products.map((product) => {
                            return (
                                <div className="col-md-4 p-5">
                                    <div className="card">
                                        <img src={product.image} className="card-img-top" alt={product.category} />
                                        <div className="card-body">
                                            <h5 className="card-title">Category: {product.category}</h5>
                                            <h5 className="card-title">{product.title}</h5>
                                            <p className="card-text">{product.description}</p>
                                            
                                        </div>
                                    </div>
                                </div>
                            )
                        })
                    }
                </div>
            </div>
        </div>
    )
}

export default ProductsComponent