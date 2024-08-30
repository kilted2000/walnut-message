
 const API_URL = 'http://localhost:8080';

export const getMessages = async () => {
    try {
        const response = await fetch(`${API_URL}/hello`, {
            method: 'GET',
            headers: {
                "Content-Type": "application/json",
                "Access-Control-Allow-Origin": "*", 
            },
            mode: 'cors', 
        });

        if (!response.ok) {
            throw new Error(`Error fetching messages: ${response.status}`);
        }

        const data = await response.json();
        return data;
    } catch (error) {
        console.error('Error fetching messages:', error);
        throw error;
    }
};

export const saveMessage = async (content) => {
    try {
        const response = await fetch(`${API_URL}/hello`, {
            method: 'POST',
            headers: {
                "Content-Type": "application/json",
                "Access-Control-Allow-Origin": "*", 
            },
            body: JSON.stringify({ content }),
            mode: 'cors', 
        });

        if (!response.ok) {
            throw new Error(`Error saving message: ${response.status}`);
        }

        const data = await response.json();
        return data;
    } catch (error) {
        console.error('Error saving message:', error);
        throw error;
    }
};
