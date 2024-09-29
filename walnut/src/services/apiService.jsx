
 const API_URL = 'http://localhost:8080';

export const getNotes = async () => {
    try {
        const response = await fetch(`${API_URL}/hello`, {
            method: 'GET',
            headers: {
                "Content-Type": "application/json",
              
            },
            mode: 'cors', 
            credentials: 'include',
        });

        if (!response.ok) {
            throw new Error(`Error fetching notes: ${response.status}`);
        }

        const data = await response.json();
        return data;
    } catch (error) {
        console.error('Error fetching notes:', error);
        throw error;
    }
};

export const saveNote = async (content) => {
    try {
        const response = await fetch(`${API_URL}/hello`, {
            method: 'POST',
            headers: {
                "Content-Type": "application/json",
                
            },
            body: JSON.stringify({ content }),
            mode: 'cors', 
        });

        if (!response.ok) {
            throw new Error(`Error saving notes: ${response.status}`);
        }

        const data = await response.json();
        return data;
    } catch (error) {
        console.error('Error saving notes:', error);
        throw error;
    }
};
