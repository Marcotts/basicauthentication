import React from "react";
import './NewsTable.css';
import Card from "../../Commun/Composantes/Card";

const NewsTable = () => {
    return (
        <div className="news-table">
            <Card
                imageUrl="https://images.theabcdn.com/i/34617011/600x600/c.jpg"
                title="Keyframe 141 - Dragon Ball Super // Samurai Warriors"
                body="Keyframe comes this is a sample body text for testing of my card component"
                carWidth={300}
                imageHeight={300}
            />
            <Card
                imageUrl="https://images.theabcdn.com/i/27734458/600x600/c.jpg"
                title="Out Now 280: Ghost in the Shell"
                body="This is a sample body text for testing of my card component"
                carWidth={300}
                imageHeight={300}
            />
            <Card
                imageUrl="https://images.theabcdn.com/i/36397029/600x600/c.jpg"
                title='Episode 40 "Cool Cats in a Depp Pool"'
                body="This is a sample body text for testing of my card component"
                carWidth={300}
                imageHeight={300}
            />
            <Card
                imageUrl="https://cdn.hobbyconsolas.com/sites/navi.axelspringer.es/public/styles/855/public/media/image/2020/10/high-rise-invasion-poster-2115691.jpg?itok=DEkpQP24"
                title="High-Rise Invasion, el nuevo y sangriento anime de Netflix"
                body="Así de sangriento luce el tráiler de High-Rise Invasion, la nueva serie de anime de Netflix."
                carWidth={300}
                imageHeight={300}
            />
        </div>
    );
};

export default NewsTable;