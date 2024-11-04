package defpackage;

import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bby implements bdi {
    private final ViewConfiguration a;

    public bby(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.bdi
    public final float a() {
        return this.a.getScaledTouchSlop();
    }

    @Override // defpackage.bdi
    public final long b() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.bdi
    public final long c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.bdi
    public final /* synthetic */ long d() {
        return a.k(48.0f, 48.0f);
    }
}
