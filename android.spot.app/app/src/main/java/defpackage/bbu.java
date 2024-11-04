package defpackage;

import android.view.Choreographer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbu implements Choreographer.FrameCallback, Runnable {
    final /* synthetic */ bbv a;

    public bbu(bbv bbvVar) {
        this.a = bbvVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a.d.removeCallbacks(this);
        this.a.b();
        bbv bbvVar = this.a;
        synchronized (bbvVar.e) {
            if (!bbvVar.h) {
                return;
            }
            bbvVar.h = false;
            List list = bbvVar.f;
            bbvVar.f = bbvVar.g;
            bbvVar.g = list;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((Choreographer.FrameCallback) list.get(i)).doFrame(j);
            }
            list.clear();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b();
        bbv bbvVar = this.a;
        synchronized (bbvVar.e) {
            if (bbvVar.f.isEmpty()) {
                bbvVar.c.removeFrameCallback(this);
                bbvVar.h = false;
            }
        }
    }
}
