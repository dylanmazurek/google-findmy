package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgb extends dgc {
    private final dgj a;

    public dgb(dgj dgjVar) {
        this.a = dgjVar;
    }

    @Override // defpackage.dgc
    public final dgi a(dfq dfqVar, Map map) {
        try {
            dgj dgjVar = this.a;
            int i = dfqVar.a;
            HttpPost httpPost = new HttpPost(dfqVar.b);
            httpPost.addHeader("Content-Type", dfqVar.b());
            byte[] j = dfqVar.j();
            if (j != null) {
                httpPost.setEntity(new ByteArrayEntity(j));
            }
            dgh.a(httpPost, map);
            dgh.a(httpPost, dfqVar.d());
            HttpParams params = httpPost.getParams();
            int a = dfqVar.a();
            HttpConnectionParams.setConnectionTimeout(params, 5000);
            HttpConnectionParams.setSoTimeout(params, a);
            HttpResponse execute = ((dgh) dgjVar).a.execute(httpPost);
            int statusCode = execute.getStatusLine().getStatusCode();
            Header[] allHeaders = execute.getAllHeaders();
            ArrayList arrayList = new ArrayList(allHeaders.length);
            for (Header header : allHeaders) {
                arrayList.add(new dfl(header.getName(), header.getValue()));
            }
            if (execute.getEntity() == null) {
                return new dgi(statusCode, arrayList, -1, null);
            }
            long contentLength = execute.getEntity().getContentLength();
            if (((int) contentLength) == contentLength) {
                return new dgi(statusCode, arrayList, (int) execute.getEntity().getContentLength(), execute.getEntity().getContent());
            }
            throw new IOException(a.ap(contentLength, "Response too large: "));
        } catch (ConnectTimeoutException e) {
            throw new SocketTimeoutException(e.getMessage());
        }
    }
}
