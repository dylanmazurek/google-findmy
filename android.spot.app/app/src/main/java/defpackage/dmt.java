package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmt implements dij {
    @Override // defpackage.dij
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, div divVar) {
        try {
            dtd.c((ByteBuffer) obj, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
