package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flj implements fhv {
    final /* synthetic */ fhw a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public flj(fhw fhwVar, bym bymVar, int i) {
        this.c = i;
        this.a = fhwVar;
        this.b = bymVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.fhv
    public final void a(Status status) {
        if (this.c != 0) {
            ((gok) this.b).a.remove(this.a);
        } else if (status.a()) {
            this.a.g(TimeUnit.MILLISECONDS);
            ((bym) this.b).s(null);
        } else {
            ((bym) this.b).r(fma.aW(status));
        }
    }

    public flj(gok gokVar, BasePendingResult basePendingResult, int i) {
        this.c = i;
        this.a = basePendingResult;
        this.b = gokVar;
    }
}
