import { fileURLToPath, URL } from 'node:url';

import { defineConfig } from 'vite';
import vue from '@vitejs/plugin-vue';
import vueDevTools from 'vite-plugin-vue-devtools';

// https://vite.dev/config/
export default defineConfig({
  plugins: [vue(), vueDevTools()],
  resolve: {
    alias: {
      '@': fileURLToPath(new URL('./src', import.meta.url)),
    },
  },
  server: {
    // proxy 설정: cors 문제 우회
    proxy: {
      // /api로 시작하는 모든 요청을 아래 설정에 따라 처리
      '/api': {
        // target: 실제 요청을 보낼 백엔드 서버 주소
        target: 'http://localhost:3000',
        changeOrigin: true,
        // /api 경로 제거 후 전달
        rewrite: (path) => path.replace(/^\/api/, ''),
      },
    },
  },
});
