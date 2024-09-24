import React, { useState, useEffect } from 'react';
import { getNotes, saveNote } from '../services/apiService';

const NoteComponent = () => {
    const [notes, setNotes] = useState([]);
    const [newNote, setNewNote] = useState('');

    useEffect(() => {
        fetchNotes();
    }, []);

    const fetchNotes = async () => {
        try {
            const data = await getNotes();
            setNotes(data);
        } catch (error) {
            console.error('Failed to fetch notes.Tha mi Dulich', error);
        }
    };

    const handleSaveNote = async () => {
        try {
            await saveNote(newNote);
            fetchNotes();
            setNewNote('');
        } catch (error) {
            console.error('Failed to save note. Tha mi Dulilch', error);
        }
    };

    return (
        <div>
            <h1>Suggested Places to See</h1>
            <ul>
                {notes.map((note) => (
                    <li key={note.id}>{note.content}</li>
                ))}
            </ul>
            <input
                type="textarea"
                value={newNote}
                onChange={(e) => setNewNote(e.target.value)}
                placeholder="Enter new suggestions"
            />
            <button onClick={handleSaveNote}>Save Suggestions</button>
        </div>
    );
};

export default NoteComponent;