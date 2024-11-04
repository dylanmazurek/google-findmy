package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class ido {
    protected final int b;

    public ido(int i) {
        this.b = i;
    }

    public abstract boolean a();

    public String toString() {
        int i = this.b;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "REQUEST_MTU";
                    }
                    return "SUBSCRIBE_TO_NOTIFICATIONS";
                }
                return "READ_REMOTE_RSSI";
            }
            return "WRITE";
        }
        return "READ";
    }
}
