package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class fly {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
