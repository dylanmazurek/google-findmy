package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqf implements djg {
    private final ByteBuffer a;

    public dqf(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // defpackage.djg
    public final /* bridge */ /* synthetic */ Object a() {
        this.a.position(0);
        return this.a;
    }

    @Override // defpackage.djg
    public final void b() {
    }
}
