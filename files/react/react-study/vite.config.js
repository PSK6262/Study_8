import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'

// https://vite.dev/config/
export default defineConfig({
  plugins: [react()],
  //base:'/foodmarket' 
  //이러면 localhost:5173/fdm/ 이 된다
})
