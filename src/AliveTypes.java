public enum AliveTypes {
    KNIGHT, ARCHER {
        private Bullet bullet;

        public Bullet getBullet() {
            return bullet;
        }

        public void setBullet(Bullet bullet) {
            this.bullet = bullet;
        }
    }, WIZARD;
}
