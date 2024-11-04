package defpackage;

import android.database.Observable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lk extends Observable {
    public final void a() {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((eu) this.mObservers.get(size)).d();
            } else {
                return;
            }
        }
    }

    public final void b(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((eu) this.mObservers.get(size)).i(i, i2);
            } else {
                return;
            }
        }
    }

    public final void c(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((eu) this.mObservers.get(size)).e(i, i2);
            } else {
                return;
            }
        }
    }

    public final void d(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((eu) this.mObservers.get(size)).f(i, i2);
            } else {
                return;
            }
        }
    }

    public final boolean e() {
        if (!this.mObservers.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void f(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((eu) this.mObservers.get(size)).h(i, i2);
            } else {
                return;
            }
        }
    }
}
