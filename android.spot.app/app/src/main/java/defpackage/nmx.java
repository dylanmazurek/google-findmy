package defpackage;

import android.net.TrafficStats;
import android.support.design.widget.R;
import android.util.Log;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.ThreadStatsUid;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nmx extends ExperimentalUrlRequest {
    public static final String a = "nmx";
    public final nmu b;
    public final Executor c;
    public final String d;
    public final boolean h;
    public final String i;
    public nnh j;
    public Executor k;
    public String m;
    public ReadableByteChannel n;
    public nnf o;
    public String p;
    public HttpURLConnection q;
    public final nml r;
    public final int s;
    public final nmg t;
    public final long u;
    public int v;
    public int w;
    public boolean x;
    public nmp y;
    public final Map e = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    public final List f = new ArrayList();
    public final AtomicInteger g = new AtomicInteger(0);
    private final AtomicBoolean z = new AtomicBoolean(false);
    public volatile int l = -1;

    /* JADX WARN: Failed to find 'out' block for switch in B:36:0x00ea. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x00ed. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:38:0x00f0. Please report as an issue. */
    public nmx(nml nmlVar, UrlRequest.Callback callback, final Executor executor, Executor executor2, String str, String str2, boolean z, boolean z2, int i, final boolean z3, final int i2, long j, String str3, ArrayList arrayList, UploadDataProvider uploadDataProvider, Executor executor3) {
        nnh nnhVar;
        int i3;
        this.h = z;
        this.b = new nmu(this, callback, executor2);
        final int threadStatsTag = !z2 ? TrafficStats.getThreadStatsTag() : i;
        this.c = new nmw(new Executor() { // from class: nmq
            @Override // java.util.concurrent.Executor
            public final void execute(final Runnable runnable) {
                final int i4 = threadStatsTag;
                final boolean z4 = z3;
                final int i5 = i2;
                executor.execute(new Runnable() { // from class: nmr
                    @Override // java.lang.Runnable
                    public final void run() {
                        int threadStatsTag2 = TrafficStats.getThreadStatsTag();
                        TrafficStats.setThreadStatsTag(i4);
                        Runnable runnable2 = runnable;
                        boolean z5 = z4;
                        if (z5) {
                            ThreadStatsUid.set(i5);
                        }
                        try {
                            runnable2.run();
                            if (z5) {
                                ThreadStatsUid.clear();
                            }
                            TrafficStats.setThreadStatsTag(threadStatsTag2);
                        } catch (Throwable th) {
                            if (z5) {
                                ThreadStatsUid.clear();
                            }
                            TrafficStats.setThreadStatsTag(threadStatsTag2);
                            throw th;
                        }
                    }
                });
            }
        });
        this.r = nmlVar;
        this.s = nmlVar.a;
        this.t = nmlVar.b;
        this.m = str;
        this.d = str2;
        this.u = j;
        if (!"OPTIONS".equalsIgnoreCase(str3) && !"GET".equalsIgnoreCase(str3) && !"HEAD".equalsIgnoreCase(str3) && !"POST".equalsIgnoreCase(str3) && !"PUT".equalsIgnoreCase(str3) && !"DELETE".equalsIgnoreCase(str3) && !"TRACE".equalsIgnoreCase(str3) && !"PATCH".equalsIgnoreCase(str3)) {
            throw new IllegalArgumentException("Invalid http method ".concat(str3));
        }
        this.i = str3;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Map.Entry entry = (Map.Entry) arrayList.get(i4);
            String str4 = (String) entry.getKey();
            while (true) {
                if (i3 < str4.length()) {
                    char charAt = str4.charAt(i3);
                    if (charAt != ',' && charAt != '/' && charAt != '{' && charAt != '}') {
                        switch (charAt) {
                            case R.styleable.TextInputLayout_errorIconTintMode /* 39 */:
                            case R.styleable.TextInputLayout_errorTextAppearance /* 40 */:
                            case R.styleable.TextInputLayout_errorTextColor /* 41 */:
                                break;
                            default:
                                switch (charAt) {
                                    case R.styleable.TextInputLayout_placeholderTextColor /* 58 */:
                                    case R.styleable.TextInputLayout_prefixText /* 59 */:
                                    case R.styleable.TextInputLayout_prefixTextAppearance /* 60 */:
                                    case R.styleable.TextInputLayout_prefixTextColor /* 61 */:
                                    case R.styleable.TextInputLayout_shapeAppearance /* 62 */:
                                    case R.styleable.TextInputLayout_shapeAppearanceOverlay /* 63 */:
                                    case R.styleable.TextInputLayout_startIconCheckable /* 64 */:
                                        break;
                                    default:
                                        switch (charAt) {
                                            case '[':
                                            case '\\':
                                            case ']':
                                                break;
                                            default:
                                                i3 = (Character.isISOControl(charAt) || Character.isWhitespace(charAt)) ? 0 : i3 + 1;
                                                break;
                                        }
                                }
                        }
                    }
                } else if (!((String) entry.getValue()).contains("\r\n")) {
                    this.e.put((String) entry.getKey(), (String) entry.getValue());
                }
            }
            throw new IllegalArgumentException("Invalid header with headername: ".concat(String.valueOf((String) entry.getKey())));
        }
        if (uploadDataProvider == null) {
            nnhVar = null;
        } else if (this.e.containsKey("Content-Type")) {
            nnhVar = new nnh(uploadDataProvider);
        } else {
            throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
        }
        this.j = nnhVar;
        this.k = (executor3 == null || this.h) ? executor3 : new nna(executor3, 0);
    }

    public final void a() {
        this.c.execute(new mgs(this, 18, null));
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void b(CronetException cronetException) {
        int i;
        int i2;
        do {
            i = this.g.get();
            if (i != 0) {
                if (i != 6 && i != 7) {
                    i2 = 8;
                    if (i == 8) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                throw new IllegalStateException("Can't enter error state before start");
            }
        } while (!this.g.compareAndSet(i, 6));
        e();
        d();
        nmu nmuVar = this.b;
        nnf nnfVar = this.o;
        ((nmx) nmuVar.d).a();
        kvo kvoVar = new kvo(nmuVar, (UrlResponseInfo) nnfVar, cronetException, i2);
        try {
            nmuVar.b.execute(kvoVar);
        } catch (InlineExecutionProhibitedException unused) {
            ?? r5 = nmuVar.c;
            if (r5 != 0) {
                r5.execute(kvoVar);
            }
        }
    }

    public final void c(Throwable th) {
        b(new nlw("Exception received from UploadDataProvider", th));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        int andSet = this.g.getAndSet(8);
        if (andSet != 1 && andSet != 2 && andSet != 3 && andSet != 4 && andSet != 5) {
            return;
        }
        e();
        d();
        nmu nmuVar = this.b;
        nnf nnfVar = this.o;
        ((nmx) nmuVar.d).a();
        nmuVar.b.execute(new miy(nmuVar, nnfVar, 12));
    }

    public final void d() {
        if (this.j != null && this.z.compareAndSet(false, true)) {
            try {
                Executor executor = this.k;
                nnh nnhVar = this.j;
                nnhVar.getClass();
                executor.execute(new miy(this, new nmn(nnhVar, 4), 8));
            } catch (RejectedExecutionException e) {
                Log.e(a, "Exception when closing uploadDataProvider", e);
            }
        }
    }

    public final void e() {
        this.c.execute(new mgs(this, 16, null));
    }

    public final void f() {
        this.l = 13;
        this.c.execute(new miy(this, new nmn(this, 3), 7));
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        i(3, 1, new mgs(this, 20));
    }

    public final void g() {
        this.c.execute(new miy(this, new nmn(this, 2), 7));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // org.chromium.net.UrlRequest
    public final void getStatus(UrlRequest.StatusListener statusListener) {
        int i = this.g.get();
        int i2 = this.l;
        switch (i) {
            case 0:
            case 6:
            case 7:
            case 8:
                i2 = -1;
                break;
            case 1:
                break;
            case 2:
            case 3:
            case 4:
                i2 = 0;
                break;
            case 5:
                i2 = 14;
                break;
            default:
                throw new IllegalStateException(a.ae(i, "Switch is exhaustive: "));
        }
        nmu nmuVar = this.b;
        nmuVar.b.execute(new bth(new nnj(statusListener), i2, 13));
    }

    public final void h(String str, Exception exc) {
        Log.e(a, a.ag(str, "Exception in ", " method"), exc);
        this.x = true;
    }

    public final void i(int i, int i2, Runnable runnable) {
        if (!this.g.compareAndSet(i, i2)) {
            int i3 = this.g.get();
            if (i3 != 8 && i3 != 6) {
                throw new IllegalStateException(a.ad(i3, i, "Invalid state transition - expected ", " but was "));
            }
            return;
        }
        runnable.run();
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        int i = this.g.get();
        if (i != 7 && i != 6 && i != 8) {
            return false;
        }
        return true;
    }

    @Override // org.chromium.net.UrlRequest
    public final void read(final ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            if (byteBuffer.hasRemaining()) {
                i(4, 5, new miy(this, new nmy() { // from class: nms
                    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.concurrent.Executor, java.lang.Object] */
                    @Override // defpackage.nmy
                    public final void a() {
                        int i;
                        nmx nmxVar = nmx.this;
                        ReadableByteChannel readableByteChannel = nmxVar.n;
                        ByteBuffer byteBuffer2 = byteBuffer;
                        if (readableByteChannel != null) {
                            nmxVar.v++;
                            i = readableByteChannel.read(byteBuffer2);
                        } else {
                            i = -1;
                        }
                        if (i != -1) {
                            nmu nmuVar = nmxVar.b;
                            nmuVar.a(new nmt(nmuVar, nmxVar.o, byteBuffer2, 1));
                            return;
                        }
                        ReadableByteChannel readableByteChannel2 = nmxVar.n;
                        if (readableByteChannel2 != null) {
                            readableByteChannel2.close();
                        }
                        if (nmxVar.g.compareAndSet(5, 7)) {
                            nmxVar.e();
                            nmu nmuVar2 = nmxVar.b;
                            nmuVar2.b.execute(new miy(nmuVar2, nmxVar.o, 11));
                        }
                    }
                }, 10));
                return;
            }
            throw new IllegalArgumentException("ByteBuffer is already full.");
        }
        throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
    }

    @Override // org.chromium.net.UrlRequest
    public final void start() {
        this.l = 10;
        this.r.c.incrementAndGet();
        i(0, 1, new mgs(this, 17, null));
    }
}
