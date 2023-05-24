FROM node:13.12.0-alpine
WORKDIR /app
COPY package.json /bleed_blue_frontend/
COPY package-lock.json /bleed_blue_frontend/
RUN npm install
COPY . .
#RUN npm run build
ENTRYPOINT ["npm", "start"]