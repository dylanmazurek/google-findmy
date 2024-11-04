package defpackage;

import java.nio.channels.WritableByteChannel;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface nkq extends WritableByteChannel, nlj {
    void E(int i);

    void G(int i);

    void L(String str);

    @Override // defpackage.nlj, java.io.Flushable
    void flush();
}
