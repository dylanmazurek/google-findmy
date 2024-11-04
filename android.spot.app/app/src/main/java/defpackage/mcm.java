package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.logging.Level;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mcm extends BidirectionalStream.Callback {
    final /* synthetic */ mco a;
    private List b;

    public mcm(mco mcoVar) {
        this.a = mcoVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ae A[Catch: all -> 0x02e7, TryCatch #0 {, blocks: (B:48:0x00f9, B:50:0x00ff, B:52:0x0103, B:54:0x0107, B:56:0x0111, B:58:0x0115, B:59:0x02c6, B:62:0x012e, B:64:0x0138, B:65:0x0173, B:67:0x017a, B:68:0x0190, B:70:0x0198, B:72:0x019f, B:73:0x0145, B:75:0x0149, B:76:0x0152, B:78:0x015c, B:79:0x016d, B:80:0x0165, B:81:0x01a4, B:83:0x01a8, B:88:0x01c8, B:90:0x01cc, B:91:0x01e2, B:99:0x0200, B:101:0x0204, B:104:0x0227, B:116:0x02aa, B:118:0x02ae, B:125:0x02c9, B:128:0x02e6, B:129:0x02ce, B:85:0x01ba, B:87:0x01be, B:92:0x01e6, B:94:0x01f0, B:96:0x01f8, B:102:0x021b, B:105:0x023e, B:107:0x0251, B:109:0x025b, B:111:0x026d, B:113:0x0279, B:115:0x027f, B:119:0x0298, B:121:0x029c, B:123:0x02a5), top: B:47:0x00f9, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a(java.util.List r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mcm.a(java.util.List, boolean):void");
    }

    private static final mca b(UrlResponseInfo urlResponseInfo) {
        return mfh.a(urlResponseInfo.getHttpStatusCode());
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onCanceled(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        mca mcaVar;
        maz mazVar = mfk.n;
        synchronized (this.a.p.s) {
            mcaVar = this.a.p.x;
            if (mcaVar == null) {
                if (urlResponseInfo != null) {
                    mcaVar = b(urlResponseInfo);
                } else {
                    mcaVar = mca.c.d("stream cancelled without reason");
                }
            }
        }
        this.a.c(mcaVar);
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onFailed(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.a.c(mca.i.c(cronetException));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onReadCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        List list;
        byteBuffer.flip();
        maz mazVar = mfk.n;
        synchronized (this.a.p.s) {
            this.a.p.y = z;
            if (byteBuffer.remaining() != 0) {
                mfk mfkVar = this.a.p;
                mfkVar.w += byteBuffer.remaining();
                mii miiVar = new mii(byteBuffer);
                mca mcaVar = mfkVar.o;
                if (mcaVar != null) {
                    Charset charset = mfkVar.q;
                    charset.getClass();
                    int f = miiVar.f();
                    byte[] bArr = new byte[f];
                    miiVar.k(bArr, 0, f);
                    mfkVar.o = mcaVar.a("DATA-----------------------------\n".concat(new String(bArr, charset)));
                    if (mfkVar.o.m.length() > 1000) {
                        mfkVar.l(mfkVar.o, false, mfkVar.p);
                    }
                } else if (!mfkVar.r) {
                    mfkVar.l(mca.h.d("headers not received before payload"), false, new mbc());
                } else {
                    miiVar.f();
                    if (mfkVar.l) {
                        mcs.q.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundDataReceived", "Received data on closed stream");
                    } else {
                        try {
                            mhi mhiVar = mfkVar.m;
                            if (!mhiVar.b() && !mhiVar.f) {
                                mhiVar.d.h(miiVar);
                                mhiVar.a();
                            }
                        } catch (Throwable th) {
                            mfkVar.k(th);
                        }
                    }
                }
            }
        }
        if (z && (list = this.b) != null) {
            a(list, true);
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onResponseHeadersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        a(urlResponseInfo.getAllHeadersAsList(), false);
        bidirectionalStream.read(ByteBuffer.allocateDirect(4096));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onResponseTrailersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, UrlResponseInfo.HeaderBlock headerBlock) {
        boolean z;
        List asList = headerBlock.getAsList();
        this.b = asList;
        maz mazVar = mfk.n;
        synchronized (this.a.p.s) {
            z = this.a.p.y;
        }
        if (z) {
            a(asList, true);
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onStreamReady(BidirectionalStream bidirectionalStream) {
        maz mazVar = mfk.n;
        synchronized (this.a.p.s) {
            this.a.p.m();
            mfk mfkVar = this.a.p;
            mfkVar.u = true;
            for (mcn mcnVar : mfkVar.t) {
                mfkVar.A.d((ByteBuffer) mcnVar.c, mcnVar.a, mcnVar.b);
            }
            mfkVar.t.clear();
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onSucceeded(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        boolean z;
        maz mazVar = mfk.n;
        synchronized (this.a.p.s) {
            z = false;
            if (this.b != null && this.a.p.y) {
                z = true;
            }
        }
        if (!z) {
            List list = this.b;
            if (list != null) {
                a(list, true);
            } else if (urlResponseInfo != null) {
                a(urlResponseInfo.getAllHeadersAsList(), true);
            } else {
                throw new AssertionError("No response header or trailer");
            }
        }
        this.a.c(b(urlResponseInfo));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onWriteCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        maz mazVar = mfk.n;
        synchronized (this.a.p.s) {
            mco mcoVar = this.a;
            mfk mfkVar = mcoVar.p;
            boolean z2 = false;
            if (!mfkVar.z) {
                mfkVar.z = true;
                for (mjo mjoVar : mcoVar.f.b) {
                }
            }
            mfk mfkVar2 = this.a.p;
            int position = byteBuffer.position();
            synchronized (mfkVar2.a) {
                hwx.V(mfkVar2.e, "onStreamAllocated was not called, but it seems the stream is active");
                int i = mfkVar2.d;
                int i2 = mfkVar2.g;
                int i3 = i - position;
                mfkVar2.d = i3;
                if (i >= i2 && i3 < i2) {
                    z2 = true;
                }
            }
            if (z2) {
                mfkVar2.a();
            }
        }
    }
}
