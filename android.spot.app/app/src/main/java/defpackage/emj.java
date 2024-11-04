package defpackage;

import android.os.RemoteException;
import android.os.SystemClock;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class emj implements Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ emj(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                try {
                    fse fseVar = ((frz) obj).a;
                    fseVar.c(1, fseVar.a());
                    return;
                } catch (RemoteException e) {
                    throw new fsc(e);
                }
            }
            ((eir) obj).e(Long.valueOf(SystemClock.elapsedRealtime()));
            return;
        }
        ((eir) obj).e(0L);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
            return Consumer$CC.$default$andThen(this, consumer);
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
