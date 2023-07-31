const Articulo = () => {
    const Title = () => <h2>Este es el título del artículo</h2>;
    const Paragraph = () => <p>Este es el párrafo del artículo</p>;
  
    return (
      <div>
        {Title()}
        {Paragraph()}
      </div>
    );
  };