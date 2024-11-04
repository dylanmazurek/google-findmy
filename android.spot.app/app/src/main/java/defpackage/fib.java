package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fib implements fia {
    private final /* synthetic */ int a;

    @Override // defpackage.fia
    public final void a(fhz fhzVar) {
        if (this.a != 0) {
            Status status = (Status) fhzVar;
            if (status.a()) {
                return;
            }
            new ExecutionException(String.format("%s: %d", status.h, Integer.valueOf(status.g)), null);
            return;
        }
        throw null;
    }
}
