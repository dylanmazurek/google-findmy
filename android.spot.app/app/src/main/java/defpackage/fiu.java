package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fiu {
    final /* synthetic */ BasePendingResult a;

    public fiu(BasePendingResult basePendingResult) {
        this.a = basePendingResult;
    }

    protected final void finalize() {
        ThreadLocal threadLocal = BasePendingResult.b;
        BasePendingResult.m(this.a.e);
        super.finalize();
    }
}
