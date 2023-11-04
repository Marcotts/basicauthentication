import React from 'react';
import { createBoard } from '@wixc3/react-board';
import Card from '../../../Commun/Composantes/Card.jsx';

export default createBoard({
    name: 'Card1',
    Board: () => <Card body={'This is a card'} carWidth={250} imageHeight={250} title="This is the title" imageUrl="https://images.theabcdn.com/i/34617011/600x600/c.jpg" />,
    environmentProps: {
        canvasWidth: 404
    }
});
