package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class liu extends IOException {
    private static final long serialVersionUID = -6947486886997889499L;

    liu() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public liu(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public liu(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
