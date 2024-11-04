package defpackage;

import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dnx implements dje {
    private final Object a;
    private final /* synthetic */ int b;

    public dnx(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.dje
    public final Class a() {
        if (this.b != 0) {
            return ByteBuffer.class;
        }
        return this.a.getClass();
    }

    @Override // defpackage.dje
    public final void f(dgs dgsVar, djd djdVar) {
        RandomAccessFile randomAccessFile;
        if (this.b != 0) {
            try {
                Object obj = this.a;
                int i = dtd.a;
                FileChannel fileChannel = null;
                try {
                    long length = ((File) obj).length();
                    if (length <= 2147483647L) {
                        if (length != 0) {
                            randomAccessFile = new RandomAccessFile((File) obj, "r");
                            try {
                                fileChannel = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
                                MappedByteBuffer load = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                                if (fileChannel != null) {
                                    try {
                                        fileChannel.close();
                                    } catch (IOException unused) {
                                    }
                                }
                                try {
                                    randomAccessFile.close();
                                } catch (IOException unused2) {
                                }
                                djdVar.b(load);
                                return;
                            } catch (Throwable th) {
                                th = th;
                                if (fileChannel != null) {
                                    try {
                                        fileChannel.close();
                                    } catch (IOException unused3) {
                                    }
                                }
                                if (randomAccessFile != null) {
                                    try {
                                        randomAccessFile.close();
                                        throw th;
                                    } catch (IOException unused4) {
                                        throw th;
                                    }
                                }
                                throw th;
                            }
                        }
                        throw new IOException("File unsuitable for memory mapping");
                    }
                    throw new IOException("File too large to map into memory");
                } catch (Throwable th2) {
                    th = th2;
                    randomAccessFile = null;
                }
            } catch (IOException e) {
                djdVar.e(e);
            }
        } else {
            djdVar.b(this.a);
        }
    }

    @Override // defpackage.dje
    public final int g() {
        return 1;
    }

    @Override // defpackage.dje
    public final void cr() {
    }

    @Override // defpackage.dje
    public final void d() {
    }
}
