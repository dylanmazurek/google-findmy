package defpackage;

import java.io.IOException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class njn extends IOException {
    public final int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public njn(int i) {
        super("stream was reset: ".concat(mkm.aU(i)));
        Objects.toString(mkm.aU(i));
        this.a = i;
    }
}
